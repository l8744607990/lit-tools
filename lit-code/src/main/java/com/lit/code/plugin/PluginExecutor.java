package com.lit.code.plugin;

import com.lit.code.config.Configuration;
import com.lit.code.context.Task;
import org.apache.velocity.context.Context;

/**
 * User : liulu
 * Date : 2018/3/16 13:29
 * version $Id: PluginExecutor.java, v 0.1 Exp $
 */
public interface PluginExecutor {

    void execute(Configuration configuration, Context context, Task task);


}
