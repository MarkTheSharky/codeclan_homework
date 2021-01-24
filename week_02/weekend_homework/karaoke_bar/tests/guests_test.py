import unittest

from src.karaoke_room import *
from src.guest import *
from src.song import *

class GuestTest(unittest.TestCase):
    def setUp(self):
        self.guest = Guest("Mr Burns", 10, 50, "Blinding Lights")
        self.guest1 = Guest("Sweeny", 20, 30, "Mambo Number 5")
        self.song = Song("Mambo Number 5", "Lou Bega", 3.41)
        self.room = KaraokeRoom("The Van Halen Room", 15, 10)

# Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("Mr Burns", self.guest.name)

    def test_for_party(self):
        self.assertEqual(10, self.guest.party_size)

    def test_for_wallet(self):
        self.assertEqual(50, self.guest.wallet)

    def test_for_favourite_song(self):
        self.assertEqual("Blinding Lights", self.guest.fav_song)

# Test to add a new guest
    def test_new_guest(self):
        self.guest.add_new_guest("Mr Sweeny", 10)
        expected_result = ["Mr Sweeny plus 10 guests"]
        self.assertEqual(expected_result, self.guest.guestlist)

# Test to check for the party size of a guest
    def test_party_size(self):
        self.assertEqual(10, self.guest.get_party_size(self.guest))

# Test to check how much is in guests wallet
    def test_check_wallet(self):
        self.assertEqual("£50", self.guest.check_wallet())

# Test to receive guest favourite song
    def test_get_favourite_song(self):
        self.assertEqual("Mambo Number 5 by Lou Bega", self.guest.get_favourite_song(self.guest1))

# Test to cheer when favourite song is in the room playlist
    def test_check_playlist_for_favourite_song(self):
        self.room.add_to_playlist(self.song)
        playlist = self.room.playlist
        song = self.guest.get_favourite_song(self.guest1)
        self.assertEqual("Woop, woop!", self.guest1.cheer_for_song(playlist, song))