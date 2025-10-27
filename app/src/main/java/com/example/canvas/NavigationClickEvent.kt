package com.example.canvas

sealed interface NavigationClickEvent {
    data object BasicCanvas: NavigationClickEvent
}