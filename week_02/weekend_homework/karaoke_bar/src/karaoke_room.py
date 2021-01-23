class KaraokeRoom():
    def __init__(self, room, capacity):
        self.room_name = room
        self.capacity = capacity
        self.room_list = []
        self.assigned_rooms = []
        self.room_playlist = []

    def add_room(self, room, capacity):
        new_room = [room, capacity]
        self.room_list.append(new_room)

    def check_rooms_available(self):
        return len(self.room_list)

    def check_capacity(self):
        return self.capacity
