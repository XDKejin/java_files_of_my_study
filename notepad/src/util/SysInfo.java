package util;

/**
 * 	this class store the properties of notepad;
 *
 */
public class SysInfo {

	/**
	 * software option
	 */
	private static String ALERT_STRING;



	/**
	 * the size of window
	 */
	private static double WINDOW_SIZE_WIDTH;        //窗口的宽度
	private static double WINDOW_SIZE_HEIGHT;       //窗口的高度

	private static String FILE_CONTENT;				//文章内容

	/**
	 * software item
	 */
	//是否展开文件夹
	private static boolean IS_SHOW_FOLDER;

	/**
	 * file status
	 */
	private static String FILE_NAME;        //文件名
	private static String FILE_SIZE;        //文件大小
	private static String FILE_LOCATION;    //文件位置

	private static boolean SAVED = false;



	final private static String INIT_FOLDER = "D:\\notepad\\files\\";		//默认文件位置
	private static boolean READ_ONLY = false;	//是否只读


	public static String getAlertString() {
		return ALERT_STRING;
	}

	public static void setAlertString(String alertString) {
		ALERT_STRING = alertString;
	}

	public static double getWindowSizeWidth() {
		return WINDOW_SIZE_WIDTH;
	}

	public static void setWindowSizeWidth(double windowSizeWidth) {
		WINDOW_SIZE_WIDTH = windowSizeWidth;
	}

	public static double getWindowSizeHeight() {
		return WINDOW_SIZE_HEIGHT;
	}

	public static void setWindowSizeHeight(double windowSizeHeight) {
		WINDOW_SIZE_HEIGHT = windowSizeHeight;
	}

	public static String getFileContent() {
		return FILE_CONTENT;
	}

	public static void setFileContent(String fileContent) {
		FILE_CONTENT = fileContent;
	}

	public static boolean isIsShowFolder() {
		return IS_SHOW_FOLDER;
	}

	public static void setIsShowFolder(boolean isShowFolder) {
		IS_SHOW_FOLDER = isShowFolder;
	}

	public static String getFileName() {
		return FILE_NAME;
	}

	public static void setFileName(String fileName) {
		FILE_NAME = fileName;
	}

	public static String getFileSize() {
		return FILE_SIZE;
	}

	public static void setFileSize(String fileSize) {
		FILE_SIZE = fileSize;
	}

	public static String getFileLocation() {
		return FILE_LOCATION;
	}

	public static void setFileLocation(String fileLocation) {
		FILE_LOCATION = fileLocation;
	}

	public static String getInitFolder() {
		return INIT_FOLDER;
	}

	public static boolean isReadOnly() {
		return READ_ONLY;
	}

	public static void setReadOnly(boolean readOnly) {
		READ_ONLY = readOnly;
	}

	public static boolean isSAVED() {
		return SAVED;
	}

	public static void setSAVED(boolean SAVED) {
		SysInfo.SAVED = SAVED;
	}
}