#ifndef VIBRATION_H
#define VIBRATION_H

#include "reference.h"

class Vibration : public Reference {
    GDCLASS(Vibration, Reference);

    protected:
        static void _bind_methods();

        Vibration* instance;

    public:
        void vibrate(const int duration);

        Vibration();
        ~Vibration();
};

#endif