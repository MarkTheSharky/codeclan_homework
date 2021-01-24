class Guest():
    def __init__(self, name, party_size, wallet):
        self.name = name
        self.party_size = party_size
        self.guestlist = []
        self.wallet = wallet

    def add_new_guest(self, name, party_size):
        new_guest = f"{name} plus {party_size} guests"
        self.guestlist.append(new_guest)

    def get_party_size(self, guest):
        return guest.party_size

    def check_wallet(self):
        return f"£{self.wallet}"
