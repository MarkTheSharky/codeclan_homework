import unittest

from src.karaoke_room import *
from src.guest import *
from src.song import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room1 = KaraokeRoom("The Van Halen Room", 15)
        self.room2 = KaraokeRoom("The Hockey Cokey Karaoke", 10)
        self.room3 = KaraokeRoom("The Prince Room", 20)
        self.room4 = KaraokeRoom("The Beatles Room", 5)
        self.room_list = [[self.room1.room_name, self.room1.capacity], 
                          [self.room2.room_name, self.room2.capacity], 
                          [self.room3.room_name, self.room3.capacity], 
                          [self.room4.room_name, self.room4.capacity]]
        #     {"room_name": "", "room_capacity": 15},
        #     {"room_name": "", "room_capacity": 15},
        #     {"room_name": "", "room_capacity": 20},
        #     {"room_name": "", "room_capacity": 5}
        self.song = Song("Let me Entertain You", "Robbie Williams", 4.09)
        self.guest = Guest("Mrs Steel", 8)


#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Hockey Cokey Karaoke", self.room2.room_name)

    def test_for_capacity(self):
        self.assertEqual(15, self.room1.capacity)

#Test to add rooms to a list
    def test_add_room(self):
        self.room1.add_room(self.room1.room_name, self.room1.capacity)
        wanted = ["The Van Halen Room", 15]
        self.assertEqual([wanted], self.room1.room_list)

    def test_add_room_multiple(self):
        self.room1.add_room(self.room1.room_name, self.room1.capacity)
        self.room1.add_room(self.room2.room_name, self.room2.capacity)
        wanted = [self.room_list[0], self.room_list[1]]
        self.assertEqual(wanted, self.room1.room_list)
######## If for the second self add_room I choose room2 (Instance??) it doesn't work??

# Test to check how many rooms are available
    def test_rooms_available(self):
        self.room1.add_room(self.room1.room_name, self.room1.capacity)
        self.room1.add_room(self.room2.room_name, self.room2.capacity)
        self.room1.check_rooms_available()
        self.assertEqual(2, len(self.room1.room_list))

# Test to check capacity of room
    def test_room_capacity(self):
        self.assertEqual(10, self.room2.check_capacity())

# Test to receive room rames#######
    def test_receive_room_names(self):
        room_names_list = [self.room_list]

# #Test to check in guests to a room
#     def test_check_in_guest_to_room(self):
#         self.room.assign_room()
#         expected_result = ""
#         self.assertEqual(expected_result, )




