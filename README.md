[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_donations&business=3MJE3M4FMJYGN&lc=BR&item_name=Shin%2dNiL%27s%20Github&item_number=Github&currency_code=USD&bn=PP%2dDonationsBF%3abtn_donate_SM%2egif%3aNonHosted)

Godot Mobile Vibration 
==========
This is a vibration module for [Godot Game Engine](https://godotengine.org/) 3 for Android & iOS (need testing).


How to use
----------

### Android
- Drop the "vibration" directory inside the "modules" directory on the Godot source.
- Recompile the android export template following the [official instructions](http://docs.godotengine.org/en/latest/reference/compiling_for_android.html#compiling-export-templates). _* If you don't want or can't build the template by yourself, you can find a precompiled template with this module [here](https://github.com/Shin-NiL/godot-custom-mobile-template)_.
- In your project go to Export > Target > Android:
	- Options:
		- Custom Package:
			- place your apk from build
- On the Android export options, check the _Vibrate_ permission			
- Add the following lines to ```project.godot```:

```
[android]
modules="org/godotengine/godot/Vibration"
```
If you have more than one module separate them by comma.

### iOS
- Drop the "vibration" directory inside the "modules" directory on the Godot source;
- Recompile the iOS export template following the [official instructions](http://docs.godotengine.org/en/stable/development/compiling/compiling_for_ios.html).
- For exporting, follow the [exporting to iOS official documentation](http://docs.godotengine.org/en/stable/learning/workflow/export/exporting_for_ios.html). 
- Export your project from Godot, it'll create an Xcode project;
- Copy the library (.a) you have compiled following the official documentation inside the exported Xcode project. You must override the 'your_project_name.a' file with this file.

API Reference (Android & iOS)
-------------

The following methods are available:
```python
# Make the device vibrates
# @param int duration the vibration duration in milliseconds (this parameter is ignored on iOS)
vibrate(duration)

```

Demo
-------------
In the demo directory you'll find a working sample project for Godot 3.


