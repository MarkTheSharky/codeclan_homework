<template>
  <div>
    <h1>ToDo's</h1>
    <form v-on:submit.prevent="saveNewTask">
      <label for="new-task"></label>
      <input type="text" v-model="newTask">
      <label for="high-radio-button">High</label>
      <input type="radio" id="high-radio-button" name="priority" value=true v-model="priority">
      <label for="low-radio-button">Low</label>
      <input type="radio" id="low-radio-button" name="priority" value=false v-model="priority">
      <input type="submit" value="Save Task">
    </form>
    <ul>
      <li v-for="(task, index) in tasks" :key="index" :class="task.priority ? 'task-high':'task-low'">
        <span>Task: {{ task.task }}  This is {{ task.priority }} priority.</span>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return {
    tasks: [
      {task: "Buy shopping", priority: true},
      {task: "Clean bathroom", priority: false},
      {task: "Car's MOT", priority: true}
      ],
    newTask: "",
    priority: ""
    }
  },
  methods: {
    saveNewTask: function () {
      this.tasks.push({
        task: this.newTask,
        priority: this.priority
      })
      this.newTask = ""
      this.priority = ""
    },
    taskHighPriority: function (index) {

    }
  }
}
</script>

<style>
/* span {
  background-color: darkgoldenrod;
} */

.task-high {
  background-color: chartreuse;
  border-style: solid;
}

.task-low {
  background-color: brown;
}
</style>