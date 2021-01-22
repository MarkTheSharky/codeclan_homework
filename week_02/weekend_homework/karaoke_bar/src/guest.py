class Guest():
    def __init__(self, name, party_size):
        self.name = name
        self.party_size = party_size
        self.guestlist = []

    def add_new_guest(self, name, party_size):
        new_guest = f"{name} plus {party_size} guests"
        self.guestlist.append(new_guest)