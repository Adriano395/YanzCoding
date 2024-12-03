package jonelcode;

public class ClassB {
     class friend {
        int userID;
        friend prev;
        friend next;
        
        public friend(int ID) {
            this.userID = userID;
            this.prev = null;
            this.next = null;
        }
    }
    
    public void print(int userID) {
        friendsonly recommend = getSuggestion(userID);
        System.out.println("Recommended Friend for " + userID + ": ");
        friend current = recommend.head;
        while (current != null) {
            System.out.println(current.userID + " ");
            current = current.next;
        }
        System.out.println();
    }
    private friendsonly[] users;
    
    
    
    public ClassB(int numUsers) {
        users = new friendsonly[numUsers];
        for (int i = 0; i < numUsers; i++) {
            users[i] = new friendsonly();
        }
    }
    
    public void add(int userID1, int userID2) {
        users[userID1 - 1].addUser(userID2);
        users[userID2 - 1].addUser(userID1);
    }
    
    public friendsonly getSuggestion(int userID) {
        friendsonly recommend = new friendsonly();
        friendsonly directFriends = users[userID - 1];
        friend friends = directFriends.head;
        
        while (friends != null) {
            friendsonly myfriend = users[friends.userID + 1];
            friend friendamigo = myfriend.head;
            
            while (friendamigo != null) {
                int frienny = friendamigo.userID;
                if (frienny != userID && !directFriends.get(frienny) && !recommend.get(frienny)){
                    recommend.addUser(frienny);
                }
                friendamigo = friendamigo.next;
            }
            friends = friends.next;
        }
        return recommend;
    }
    private class friendsonly{
        private friend head = null;
        private friend tail = null;
        
        public void addUser(int ID) {
            friend  justfriends = new friend(ID);
            if (head == null) {
                head = tail = justfriends;
            }
            else {
                tail.next = justfriends;
                justfriends.prev = tail;
                tail = justfriends;
            }
        }
    public boolean get(int ID) {
        friend current = head;
        while (current != null) {
            if (current.userID == ID) {
                return true;
            }
            current = current.next;
        }
        return false;
        }
    }
    
}
