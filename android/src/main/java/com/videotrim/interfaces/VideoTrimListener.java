package com.videotrim.interfaces;

public interface VideoTrimListener {
  void onStartTrim();
  void onTrimmingProgress(int percentage);
  void onFinishTrim(String url, boolean openTrimmedVideo);
  void onError(String errorMessage);
  void onCancel();
  void onSave();
  void onShare();
}
