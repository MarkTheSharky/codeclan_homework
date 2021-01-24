import unittest

from src.guest import *

class GuestTest(unittest.TestCase):
    def setUp(self):
        self.guest = Guest("Mr Burns", 10, 50)
        self.guest2 = Guest("Sweeny", 20, 30)

# Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("Mr Burns", self.guest.name)

# Test to add a new guest
    def test_new_guest(self):
        self.guest.add_new_guest("Mr Sweeny", 10)
        expected_result = ["Mr Sweeny plus 10 guests"]
        self.assertEqual(expected_result, self.guest.guestlist)

# Test to check for the party size of a guest
    def test_party_size(self):
        self.assertEqual(10, self.guest.get_party_size(self.guest))

# Test to check how much is in guest wallet
    def test_check_wallet(self):
        self.assertEqual("£50", self.guest.check_wallet())


