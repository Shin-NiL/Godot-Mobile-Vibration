#include <core/class_db.h>
#include <core/engine.h>
#include "register_types.h"
#include "ios/src/vibration.h"

void register_vibration_types() {
    Engine::get_singleton()->add_singleton(Engine::Singleton("Vibration", memnew(Vibration)));
}

void unregister_vibration_types() {
}