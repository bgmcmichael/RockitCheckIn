//
//  Event.swift
//  Rocket
//
//  Created by Daniel Kwolek on 9/29/16.
//  Copyright © 2016 Arcore. All rights reserved.
//

import Foundation

class Event {
    var name: String?
    var location: String?
    var attendees: [User]?
    var eventID: UUID?
    var description: String?
}
