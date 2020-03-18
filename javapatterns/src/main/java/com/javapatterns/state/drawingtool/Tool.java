/* Generated by Together */

package com.javapatterns.state.drawingtool;

public interface Tool {
    void handleMousePress();

    void handleMouseRelease();

    void handleCharacter();

    void getCursor();

    void activate();

    /**
     * @link
     * @shapeType PatternLink
     * @pattern State*/
    /*# private DrawingController _drawingController; */
}