package com.example.jetpack.utils;

import android.util.Log;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/25
 * Time: 11:20
 */
public class LogUtil {
    private static final String TAG = LogUtil.class.getSimpleName();
    private static boolean LOG_ENABLE = true;
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;

    public LogUtil() {
    }

    private static String buildMsg(String msg) {
        StringBuilder buffer = new StringBuilder();
        buffer.append(msg);
        return buffer.toString();
    }

    public static void setLogEnable(boolean enable) {
        LOG_ENABLE = enable;
    }

    public static void v(String msg) {
        if (LOG_ENABLE) {
            showLogWithLineNum(1, buildMsg(msg));
        }

    }

    public static void v(String tag, String msg) {
        if (LOG_ENABLE) {
            Log.v(tag, buildMsg(msg));
        }

    }

    public static void d(String msg) {
        if (LOG_ENABLE) {
            showLogWithLineNum(2, buildMsg(msg));
        }

    }

    public static void d(String tag, String msg) {
        if (LOG_ENABLE) {
            Log.d(tag, buildMsg(msg));
        }

    }

    public static void i(String msg) {
        if (LOG_ENABLE) {
            showLogWithLineNum(3, buildMsg(msg));
        }

    }

    public static void i(String tag, String msg) {
        if (LOG_ENABLE) {
            Log.i(tag, buildMsg(msg));
        }

    }

    public static void w(String msg) {
        if (LOG_ENABLE) {
            showLogWithLineNum(4, buildMsg(msg));
        }

    }

    public static void w(String msg, Exception e) {
        if (LOG_ENABLE) {
            Log.w(TAG, buildMsg(msg), e);
        }

    }

    public static void w(String tag, String msg) {
        if (LOG_ENABLE) {
            Log.w(tag, buildMsg(msg));
        }

    }

    public static void w(String tag, String msg, Exception e) {
        if (LOG_ENABLE) {
            Log.w(tag, buildMsg(msg), e);
        }

    }

    public static void e(String msg) {
        if (LOG_ENABLE) {
            showLogWithLineNum(5, buildMsg(msg));
        }

    }

    public static void e(String msg, Exception e) {
        if (LOG_ENABLE) {
            Log.e(TAG, buildMsg(msg), e);
        }

    }

    public static void e(String tag, String msg) {
        if (LOG_ENABLE) {
            Log.e(tag, buildMsg(msg));
        }

    }

    public static void e(String tag, String msg, Exception e) {
        if (LOG_ENABLE) {
            Log.e(tag, buildMsg(msg), e);
        }

    }

    public static void showLogWithLineNum(int logLevel, String info) {
        String[] infos = getLogInfos();
        switch(logLevel) {
            case 1:
                if (LOG_ENABLE) {
                    Log.v(infos[0], infos[1] + infos[2] + info);
                }
                break;
            case 2:
                if (LOG_ENABLE) {
                    Log.d(infos[0], infos[1] + infos[2] + info);
                }
                break;
            case 3:
                if (LOG_ENABLE) {
                    Log.i(infos[0], infos[1] + infos[2] + info);
                }
                break;
            case 4:
                if (LOG_ENABLE) {
                    Log.w(infos[0], infos[1] + infos[2] + info);
                }
                break;
            case 5:
                if (LOG_ENABLE) {
                    Log.e(infos[0], infos[1] + infos[2] + info);
                }
                break;
            case 6:
                if (LOG_ENABLE) {
                    Log.wtf(infos[0], infos[1] + infos[2] + info);
                }
        }

    }

    private static String[] getLogInfos() {
        String[] infos = new String[]{"", "", ""};
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        if (elements.length < 5) {
            Log.e("LogUtil", "Stack is too shallow!!!");
            return infos;
        } else {
            infos[0] = elements[5].getClassName().substring(elements[5].getClassName().lastIndexOf(".") + 1);
            infos[1] = elements[5].getMethodName();
            infos[2] = "(line:" + elements[5].getLineNumber() + "):";
            return infos;
        }
    }
}

