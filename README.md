[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=3MJE3M4FMJYGN&lc=BR&item_name=Shin%2dNiL%27s%20Github&item_number=Github&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donate_SM%2egif%3aNonHosted)

Godot Mobile Vibration 
==========
This is an Android vibration plugin for [Godot Game Engine](https://godotengine.org/) 3.2 or greater. For Godot < 3.2 you can use the old module.


How to use
----------

- Configure, install  and enable the "Android Custom Template" for your project, just follow the [official documentation](https://docs.godotengine.org/en/latest/getting_started/workflow/export/android_custom_build.html);
- download or clone this repository;
- drop the ```vibration-plugin``` directory (from this repository) inside the ```res://android/``` directory on your Godot project.		
- on the Project Settings -> Android -> Modules, add the string:

```
org/godotengine/godot/Vibration
```
\* If you're using more than one module separate them by comma.

\* This plugin needs the ```Vibrate``` permission, which is automatically inserted.

API Reference
-------------

The following methods are available:
```python
# Make the device vibrates
# @param int duration the vibration duration in milliseconds
vibrate(duration)

```

Demo
-------------
In the demo directory you'll find a working sample project where you can see the plugin in action.


