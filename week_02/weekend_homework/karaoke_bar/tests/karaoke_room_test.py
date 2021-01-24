import unittest

from src.karaoke_room import *
from src.guest import *
# from src.song import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = KaraokeRoom("The Van Halen Room", 15)
        self.guest = Guest("Mr Burns", 10)


# Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Van Halen Room", self.room.name)

    def test_for_capacity(self):
        self.assertEqual(15, self.room.capacity)

# Test to add guest to the room
    def test_add_guest_to_room(self):
        self.room.add_guest_to_room(self.guest)
        self.assertEqual(["Mr Burns with a party of 10"], self.room.room_guest)

# Test to remove guest from room
    def test_remove_guest_from_room(self):
        self.room.add_guest_to_room(self.guest)
        self.room.remove_guest_from_room()
        self.assertEqual([], self.room.room_guest)