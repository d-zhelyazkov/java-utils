package com.xrc.command;

import com.xrc.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;

public class CommandLineBuilder implements CommandLine {
    private final Collection<String> arguments;

    public CommandLineBuilder() {
        arguments = new ArrayList<>();
    }

    public CommandLineBuilder argument(CommandLineArgument argument) {
        if (argument == null) {
            return this;
        }

        arguments.add(argument.getArgument());
        return this;
    }

    public CommandLineBuilder argument(Object argument) {
        if (argument == null) {
            return this;
        }

        arguments.add(argument.toString());
        return this;
    }

    public CommandLineBuilder arguments(Object... arguments) {
        arguments(java.util.Arrays.asList(arguments));
        return this;
    }

    public <T> CommandLineBuilder arguments(Collection<T> arguments) {
        arguments.forEach(argument -> {
            if(argument instanceof CommandLineArgument) {
                argument((CommandLineArgument)argument);
            } else {
                argument(argument);
            }
        });
        return this;
    }

    public String buildCommandLine() {
        return StringUtils.join(arguments, " ");
    }

    @Override
    public String getLine() {
        return buildCommandLine();
    }
}
