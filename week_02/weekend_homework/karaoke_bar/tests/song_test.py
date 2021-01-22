import unittest

from src.song import *

class SongTest(unittest.TestCase):
    def setUp(self):
        self.song = Song("Blinding Lights", "The Weekend", 3.20)
        self.song_list = [
            {"song_title": "Blinding Light", "artist": "", "song_length": 3.20},
            {"song_title": "Danger Zone", "artist": "Kenny Loggins", "song_length": 3.36},
            {"song_title": "Tiny Dancer", "artist": "Elton John", "song_length": 6.16},
            {"song_title": "Careless Whisper", "artist": "George Michael", "song_length": 5.01}
        ]

#Tests to check paramaters
    def test_for_song_name(self):
        self.assertEqual("Blinding Lights", self.song.name)

    def test_for_artist_name(self):
        self.assertEqual("The Weekend", self.song.artist)

    def test_for_song_length(self):
        self.assertEqual(3.20, self.song.length)

#Test to add new song
    def test_add_new_song_to_list(self):
        expected_result = {"song_title": "What Is Love", "artist": "Haddaway", "song_length": 4.56}
        self.song.add_new_song("What Is Love", "Haddaway", 4.56)
        self.assertEqual([expected_result], self.song.song_list)