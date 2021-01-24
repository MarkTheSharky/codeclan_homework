class KaraokeRoom():
    def __init__(self, name, capacity):
        self.name = name
        self.capacity = capacity
        self.room_guest = []
        self.playlist = []

# Function adds guest to room_guest list

    def add_guest_to_room(self, guest):
        guest_details = f"{guest.name} with a party of {guest.party_size}"
        self.room_guest.append(guest_details)

    def remove_guest_from_room(self):
        self.room_guest.clear()

    def add_to_playlist(self, song):
        added_song = f"{song.name} by {song.artist}"
        self.playlist.append(added_song)

    def get_room_capacity(self, room):
        return self.capacity

    def is_room_full(self, guest, room):
        if guest.party_size <= room.capacity:
            return "Room OK"
        else:
            return "Room Full"