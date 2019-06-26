package com.amitshekhar.utils;

import android.support.annotation.NonNull;

/**
 * Created by Ephraim Kigamba - ekigamba@ona.io on 2019-06-26
 */

public interface DbPasswordProvider {

    String getDbPassword(@NonNull String dbName);
}
