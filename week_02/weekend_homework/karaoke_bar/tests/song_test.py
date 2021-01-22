import unittest

from src.song import *

class SongTest(unittest.TestCase):
    def setUp(self):
        self.song = Song("Blinding Lights", "The Weekend", 3.20)

#Tests to check paramaters
    def test_for_song_name(self):
        self.assertEqual("Blinding Lights", self.song.name)

    def test_for_artist_name(self):
        self.assertEqual("The Weekend", self.song.artist)

    def test_for_song_length(self):
        self.assertEqual(3.20, self.song.length)