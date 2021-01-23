import unittest

from src.karaoke_room import *
# from src.guest import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = KaraokeRoom("The Hockey Cokey Karaoke", 10)
        self.room_list= [
            {"room_name": "Sing Song", "room_capacity": 15},
            {"room_name": "The Prince Room", "room_capacity": 20},
            {"room_name": "The Beatles Room", "room_capacity": 5}
        ]


#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Hockey Cokey Karaoke", self.room.room_name)

    def test_for_capacity(self):
        self.assertEqual(10, self.room.capacity)

#Test to add room to a list
    def test_add_room(self):
        self.room.add_room("Sing Song", 15)
        expected_result = [{"room_name": "Sing Song", "room_capacity": 15}]
        self.assertEqual(expected_result, self.room.room_list)

#Test to check how many rooms are available
    def test_rooms_available(self):
        self.room.check_rooms_available()
        self.room.add_room("Sing Song", 15)
        self.assertEqual(1, len(self.room.room_list))

# #Test to check capacity of room
#     def test_room_capacity(self):
#         self.room.check_capacity()
#         self.assertEqual(10, )

# #Test to check in guests to a room
#     def test_check_in_guest_to_room(self):
#         self.room.assign_room()
#         expected_result = ""
#         self.assertEqual(expected_result, )