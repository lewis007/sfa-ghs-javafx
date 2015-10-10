package com.sfa.ghs.custom.data;

public enum UIEnum {
	// 配载
	WB_FLIGHT_INFO("/fxml/custom/flightInfo.fxml"),
	WB_LOADING_INFO("/fxml/custom/loadingInfo.fxml"),
	WB_SPACE_BOX("/fxml/custom/spaceBox.fxml"),
	WB_ULD_BOX("/fxml/custom/uldBox.fxml"),
	WB_BULK_BOX("/fxml/custom/bulkBox.fxml"),
	WB_LOADING_TODO_INFO("/fxml/custom/loadingToDoInfo.fxml");

	private String file;

	private UIEnum(String file) {
		this.file = file;
	}

	public String getFile() {
		return file;
	}
}
