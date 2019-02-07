def can_build(platform):
    return platform == "android" or platform == "iphone"

def configure(env):
    if (env['platform'] == 'android'):
        env.android_add_java_dir("android")
	env.disable_module()
