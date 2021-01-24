import unittest

from src.karaoke_room import *
from src.guest import *
from src.song import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = KaraokeRoom("The Van Halen Room", 15, 10)
        self.guest = Guest("Mr Burns", 10, 50)
        self.guest1 = Guest("Sweeny", 20, 5)
        self.song = Song("Blinding Lights", "The Weekend", 3.20)


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

# Test to add songs to room playlist
    def test_to_add_song_to_room_playlist(self):
        self.room.add_to_playlist(self.song)
        self.assertEqual([("Blinding Lights by The Weekend")] , self.room.playlist)

# Test to get the capacity of a room
    def test_to_get_capacity_of_room(self):
        self.assertEqual(15, self.room.get_room_capacity(self.room))

# Tests to compare guest party size to room capacity
    def test_compare_party_size_to_room_capacity__OK(self):
        self.assertEqual("Room OK", self.room.is_room_full(self.guest, self.room))

    def test_compare_party_size_to_room_capacity__FULL(self):
        self.assertEqual("Room Full", self.room.is_room_full(self.guest1, self.room))

# Test to get room entry fee
    def test_get_entry_fee(self):
        self.assertEqual("£10", self.room.get_entry_fee())

# Test which will check and compare entry fee to what a customer has in their wallet
    def test_compare_fee_to_wallet__enough(self):
        self.assertEqual("Right this way!", self.room.check_pay_for_room(self.guest, self.room))

    def test_compare_fee_to_wallet__NOT_enough(self):
        self.assertEqual("Not tonight pal!", self.room.check_pay_for_room(self.guest1, self.room))