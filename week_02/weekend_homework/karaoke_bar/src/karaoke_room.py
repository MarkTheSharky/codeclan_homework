class KaraokeRoom():
    def __init__(self, room, capacity):
        self.room_name = room
        self.capacity = capacity
        self.room_list = []
        self.assigned_room = []

    def add_room(self, room, capacity):
        self.room_list.append({"room_name": room, "room_capacity": capacity})

    def check_rooms_available(self):
        return len(self.room_list)
        
    # def check_capacity(self):
    #     room_capacity = 