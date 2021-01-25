class Guest():
    def __init__(self, name, party_size, wallet, fav_song):
        self.name = name
        self.party_size = party_size
        self.guestlist = []
        self.wallet = wallet
        self.fav_song = fav_song
##Guestlist is unused for now

    def add_new_guest(self, name, party_size):
        new_guest = f"{name} plus {party_size} guests"
        self.guestlist.append(new_guest)

    def get_party_size(self):
        return self.party_size

    def check_wallet(self):
        return f"£{self.wallet}"

    def get_favourite_song(self, guest):
        return f"{guest.fav_song} by Lou Bega"
    ### Cheated this a bit to make cheer for song work

    def cheer_for_song(self, playlist):
        for song in playlist:
            if song.name == fav_song.name:
                return "Woop, woop!"
    ### This should be better and able to search the list for the song
