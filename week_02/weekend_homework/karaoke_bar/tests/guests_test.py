import unittest

from src.guest import *

class GuestTest(unittest.TestCase):
    def setUp(self):
        self.name = Guest("Mr Burns", 10)

#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("Mr Burns", self.name.name)

#Test to add a new guest
    def test_new_guest(self):
        self.name.add_new_guest("Mr Sweeny", 10)
        expected_result = ["Mr Sweeny plus 10 guests"]
        self.assertEqual(expected_result, self.name.guestlist)


