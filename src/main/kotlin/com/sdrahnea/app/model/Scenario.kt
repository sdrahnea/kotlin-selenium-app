package com.sdrahnea.app.model

class Scenario(
        val name: String,
        val steps: List<Step>
)

class Step(
        val name: String,
        val action: Action,
        val element: Element?
)

class Action(
        val value: String?,
        val type: ActionType
)

class Element(
        val name: String?,
        val xpath: String
)

enum class ActionType{
    FIND, CLICK, SEND_KEYS, EXISTS, NAVIGATE
}