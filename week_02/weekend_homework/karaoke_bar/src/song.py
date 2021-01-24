class Song():
    def __init__(self, name, artist, length):
        self.name = name
        self.artist = artist
        self.length = length
        self.song_list = []

    def add_new_song(self, name, artist, length):
        new_song = {"song_title": name, "artist": artist, "song_length": length}
        self.song_list.append(new_song)

    