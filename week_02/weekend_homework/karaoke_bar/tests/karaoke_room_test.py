import unittest

from src.karaoke_room import *
# from src.guest import *
# from src.song import *

class KaraokeTest(unittest.TestCase):
    def setUp(self):
        self.room = Karaokeroom("The Van Halen Room", 15)


    #Tests to check paramaters
    def test_for_name(self):
        self.assertEqual("The Van Halen Room", self.room.name)

    def test_for_capacity(self):
        self.assertEqual(15, self.room.capacity)

#