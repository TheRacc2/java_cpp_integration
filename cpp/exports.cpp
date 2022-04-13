#include "exports.h"

void MessageBoxCPP(const char* text) {
	MessageBoxA(nullptr, text, "Java-C++ Integration", MB_OK);
}