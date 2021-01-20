import unittest

from src.compare import compare

class TestCompare(unittest.TestCase):

    def test_compare_3_1_returns_3_is_greater_than_1(self):
        self.assertEqual("3 is greater than 1", compare(3, 1))

    def test_compare_1_3_returns_1_is_not_greater_than_3(self):
        self.assertEqual("1 is NOT greater than 3", compare(1, 3))

    def test_if_argument1_is_str(self):
        self.assertEqual("Sorry, a number is required", compare("ten", 1))

    def test_if_argument2_is_str(self):
        self.assertEqual("Sorry, a number is required", compare(1, "ten"))

    def test_if_both_arguments_are_str(self):
        self.assertEqual("Sorry, a number is required", compare("twenty", "ten"))

