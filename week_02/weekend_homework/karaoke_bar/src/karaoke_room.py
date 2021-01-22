class KaraokeRoom():
    def __init__(self, room, capacity):
        self.room_name = room
        self.capacity = capacity
        self.room_list = []

    def add_room(self, room, capacity):
        self.room_list.append({"room_name": room, "room_capacity": capacity})

    