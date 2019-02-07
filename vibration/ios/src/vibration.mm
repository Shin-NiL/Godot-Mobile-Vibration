#include "vibration.h"

#import "app_delegate.h"
#import <AudioToolbox/AudioServices.h>

Vibration::Vibration() {
    ERR_FAIL_COND(instance != NULL);
    instance = this;
}

Vibration::~Vibration() {
    instance = NULL;
}

void Vibration::vibrate(const int duration) {
    // ignores duration on iOS
    AudioServicesPlaySystemSound(kSystemSoundID_Vibrate);
}

void Vibration::_bind_methods() {
    ClassDB::bind_method(D_METHOD("vibrate"), &Vibration::vibrate);
}