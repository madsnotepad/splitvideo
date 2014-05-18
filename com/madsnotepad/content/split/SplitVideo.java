package com.madsnotepad.content.split;

import java.util.List;
import com.madsnotepad.exception.MadsnotepadException;

public interface SplitVideo {

	public List<Double> getKeyframes(String videoFile, int nearestToSeconds) throws MadsnotepadException;

	public List<String> splitVideoAtKeyframes(String sourceVideo, List<Double> keyframeList) throws MadsnotepadException;

	public void splitVideo(String sourceVideo, String outputFile, String startOffset, double endDuration) throws MadsnotepadException;

}