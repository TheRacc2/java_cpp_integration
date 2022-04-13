#pragma once

#include <fstream>
#include <Windows.h>

#ifdef JAVACPP_EXPORTS
#define JAVACPP_API __declspec(dllexport)
#else
#define JAVACPP_API __declspec(dllimport)
#endif

extern "C" JAVACPP_API void MessageBoxCPP(const char* text);