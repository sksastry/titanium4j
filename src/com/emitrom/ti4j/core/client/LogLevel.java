/************************************************************************
  LogLevel.java is part of Titanium4j Desktop 1.2  Copyright 2012 Emitrom LLC

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
**************************************************************************/
package com.emitrom.ti4j.core.client;

public enum LogLevel {

  TRACE(1), DEBUG(2), INFO(3), NOTICE(4), WARN(5), ERROR(6), CRITICAL(7), FATAL(8);

  private int level;

  public int getLevel() {
    return this.level;
  }

  private LogLevel(int level) {
    this.level = level;
  }

  public static LogLevel fromValue(int value) {
    if (value == 1) {
      return TRACE;
    } else if (value == 2) {
      return DEBUG;
    } else if (value == 3) {
      return INFO;
    } else if (value == 4) {
      return NOTICE;
    } else if (value == 5) {
      return WARN;
    } else if (value == 6) {
      return ERROR;
    } else if (value == 7) {
      return CRITICAL;
    } else if (value == 8) {
      return FATAL;
    }
    return INFO;
  }
}
