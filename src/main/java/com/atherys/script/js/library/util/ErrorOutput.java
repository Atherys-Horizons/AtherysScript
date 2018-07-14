package com.atherys.script.js.library.util;

import com.atherys.script.AtherysScript;

import java.util.function.Consumer;

public class ErrorOutput implements Consumer<String> {
    @Override
    public void accept(String msg) {
        AtherysScript.getInstance().getLogger().error(msg);
    }
}
