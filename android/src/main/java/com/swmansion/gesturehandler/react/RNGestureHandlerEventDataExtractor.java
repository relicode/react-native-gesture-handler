package com.relicode.gesturehandler.react;

import com.facebook.react.bridge.WritableMap;
import com.relicode.gesturehandler.GestureHandler;

public interface RNGestureHandlerEventDataExtractor<T extends GestureHandler> {
  void extractEventData(T handler, WritableMap eventData);
}
