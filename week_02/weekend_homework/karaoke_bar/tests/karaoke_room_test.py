import unittest

from src.karaoke_room import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = KaraokeRoom("The Hockey Cokey Karaoke", 10)
        self.new_room = [
            {
                "room_name": "Sing Song",
                "room_capacity": 15
            }
        ]


#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Hockey Cokey Karaoke", self.room.room_name)

    def test_for_capacity(self):
        self.assertEqual(10, self.room.capacity)

#Test to add room
    def test_add_room(self):
        room_name = "Sing Song"
        room_capacity = 15
        self.room.add_room("Sing Song", 15)
        self.assertEqual([{"room_name": "Sing Song", "room_capacity": 15}], self.room.room_list)