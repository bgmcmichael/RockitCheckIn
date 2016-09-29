//
//  User.swift
//  Rocket
//
//  Created by Daniel Kwolek on 9/29/16.
//  Copyright © 2016 Arcore. All rights reserved.
//

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
