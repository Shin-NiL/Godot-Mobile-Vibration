extends Node2D

var vibration

func _ready():
	if Engine.has_singleton("Vibration"):
		vibration = Engine.get_singleton("Vibration")


func _on_Button_pressed():
	if vibration:
		vibration.vibrate(500)
