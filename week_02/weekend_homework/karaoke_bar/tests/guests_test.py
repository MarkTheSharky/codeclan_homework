import unittest

from src.guest import *

class GuestTest(unittest.TestCase):
    def setUp(self):
        self.name = Guest("Mr Burns")

#Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("Mr Burns", self.name.name)