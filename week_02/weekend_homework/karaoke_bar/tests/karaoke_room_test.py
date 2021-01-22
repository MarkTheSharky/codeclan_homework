import unittest

from src.karaoke_room import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = KaraokeRoom("The Hockey Cokey Karaoke", 10)

#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Hockey Cokey Karaoke", self.room.room_name)

    def test_for_capacity(self):
        self.assertEqual(10, self.room.capacity)