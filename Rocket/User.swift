

import Foundation

class User {
    var name: String?
    var email: String?
    var password: String?
    var userID: UUID?
    var friends: [User]?
    var events: [Event]?
    
    func verifyCredentials(user: User) {
        
    }
}
