/**
 * Copyright © YOLANDA. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yolanda.nohttp;

/**
 * Created in Jul 28, 2015 7:32:05 PM
 * 
 * @author YOLANDA
 */
public class Logger {

	/**
	 * red error message
	 * 
	 * @param msg
	 */
	public static void e(String msg) {
		if (NoHttp.isDebug) {
			android.util.Log.e(NoHttp.logTag, msg);
		}
	}

	/**
	 * orange warn message
	 * 
	 * @param msg
	 */
	public static void w(String msg) {
		if (NoHttp.isDebug) {
			android.util.Log.w(NoHttp.logTag, msg);
		}
	}

	/**
	 * green message
	 * 
	 * @param msg
	 */
	public static void i(String msg) {
		if (NoHttp.isDebug) {
			android.util.Log.i(NoHttp.logTag, msg);
		}
	}

	/**
	 * blue status message
	 * 
	 * @param msg
	 */
	public static void d(String msg) {
		if (NoHttp.isDebug) {
			android.util.Log.d(NoHttp.logTag, msg);
		}
	}

}
