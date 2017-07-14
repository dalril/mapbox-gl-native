package com.mapbox.mapboxsdk.maps;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class MapChangeDispatchTest {

  private MapChangeDispatch mapChangeDispatch;

  @Mock
  MapView.OnCameraRegionWillChangeListener onCameraRegionWillChangeListener;

  @Mock
  MapView.OnCameraRegionWillChangeAnimatedListener onCameraRegionWillChangeAnimatedListener;

  @Mock
  MapView.OnCameraIsChangingListener onCameraIsChangingListener;

  @Mock
  MapView.OnCameraRegionDidChangeListener onCameraRegionDidChangeListener;

  @Mock
  MapView.OnCameraRegionDidChangeAnimatedListener onCameraRegionDidChangeAnimatedListener;

  @Mock
  MapView.OnWillStartLoadingMapListener onWillStartLoadingMapListener;

  @Mock
  MapView.OnDidFinishLoadingMapListener onDidFinishLoadingMapListener;

  @Mock
  MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener;

  @Mock
  MapView.OnWillStartRenderingFrameListener onWillStartRenderingFrameListener;

  @Mock
  MapView.OnDidFinishRenderingFrameListener onDidFinishRenderingFrameListener;

  @Mock
  MapView.OnDidFinishRenderingFrameFullyRenderedListener onDidFinishRenderingFrameFullyRenderedListener;

  @Mock
  MapView.OnWillStartRenderingMapListener onWillStartRenderingMapListener;

  @Mock
  MapView.OnDidFinishRenderingMapListener onDidFinishRenderingMapListener;

  @Mock
  MapView.OnDidFinishRenderingMapFullyRenderedListener onDidFinishRenderingMapFullyRenderedListener;

  @Mock
  MapView.OnDidFinishLoadingStyleListener onDidFinishLoadingStyleListener;

  @Mock
  MapView.OnSourceChangedListener onSourceChangedListener;

  @Mock
  MapView.OnMapChangedListener onMapChangedListener;

  @Before
  public void beforeTest() {
    MockitoAnnotations.initMocks(this);
    mapChangeDispatch = new MapChangeDispatch();
    mapChangeDispatch.addOnMapChangedListener(onMapChangedListener);
  }

  @Test
  public void testOnCameraRegionWillChangeListener() throws Exception {
    mapChangeDispatch.setOnCameraRegionWillChangeListener(onCameraRegionWillChangeListener);
    mapChangeDispatch.onCameraRegionWillChange();
    verify(onCameraRegionWillChangeListener).onCameraRegionWillChange();
    verify(onMapChangedListener).onMapChanged(MapView.REGION_WILL_CHANGE);
  }

  @Test
  public void testOnCameraIsChangingListener() throws Exception {
    mapChangeDispatch.setOnCameraIsChangingListener(onCameraIsChangingListener);
    mapChangeDispatch.onCameraIsChanging();
    verify(onCameraIsChangingListener).onCameraIsChanging();
    verify(onMapChangedListener).onMapChanged(MapView.REGION_IS_CHANGING);
  }

  @Test
  public void testOnCameraRegionWillChangeAnimatedListener() throws Exception {
    mapChangeDispatch.setOnCameraRegionWillChangeAnimatedListener(onCameraRegionWillChangeAnimatedListener);
    mapChangeDispatch.onCameraRegionWillChangeAnimated();
    verify(onCameraRegionWillChangeAnimatedListener).onCameraRegionWillChangeAnimated();
    verify(onMapChangedListener).onMapChanged(MapView.REGION_WILL_CHANGE_ANIMATED);
  }

  @Test
  public void testOnCameraRegionDidChangeListenerListener() throws Exception {
    mapChangeDispatch.setOnCameraRegionDidChangeListener(onCameraRegionDidChangeListener);
    mapChangeDispatch.onCameraRegionDidChange();
    verify(onCameraRegionDidChangeListener).onCameraRegionDidChange();
    verify(onMapChangedListener).onMapChanged(MapView.REGION_DID_CHANGE);
  }

  @Test
  public void testOnCameraRegionDidChangeAnimatedListener() throws Exception {
    mapChangeDispatch.setOnCameraRegionDidChangeAnimatedListener(onCameraRegionDidChangeAnimatedListener);
    mapChangeDispatch.onCameraRegionDidChangeAnimated();
    verify(onCameraRegionDidChangeAnimatedListener).onCameraRegionDidChangeAnimated();
    verify(onMapChangedListener).onMapChanged(MapView.REGION_DID_CHANGE_ANIMATED);
  }

  @Test
  public void testOnWillStartLoadingMapListener() throws Exception {
    mapChangeDispatch.setOnWillStartLoadingMapListener(onWillStartLoadingMapListener);
    mapChangeDispatch.onWillStartLoadingMap();
    verify(onWillStartLoadingMapListener).onWillStartLoadingMap();
    verify(onMapChangedListener).onMapChanged(MapView.WILL_START_LOADING_MAP);
  }

  @Test
  public void testOnDidFinishLoadingMapListener() throws Exception {
    mapChangeDispatch.setOnDidFinishLoadingMapListener(onDidFinishLoadingMapListener);
    mapChangeDispatch.onDidFinishLoadingMap();
    verify(onDidFinishLoadingMapListener).onDidFinishLoadingMap();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_LOADING_MAP);
  }

  @Test
  public void testOnDidFailLoadingMapListener() throws Exception {
    mapChangeDispatch.setOnDidFailLoadingMapListener(onDidFailLoadingMapListener);
    mapChangeDispatch.onDidFailLoadingMap();
    verify(onDidFailLoadingMapListener).onDidFailLoadingMap();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FAIL_LOADING_MAP);
  }

  @Test
  public void testOnWillStartRenderingFrameListener() throws Exception {
    mapChangeDispatch.setOnWillStartRenderingFrameListener(onWillStartRenderingFrameListener);
    mapChangeDispatch.onWillStartRenderingFrame();
    verify(onWillStartRenderingFrameListener).onWillStartRenderingFrame();
    verify(onMapChangedListener).onMapChanged(MapView.WILL_START_RENDERING_FRAME);
  }

  @Test
  public void testOnDidFinishRenderingFrameListener() throws Exception {
    mapChangeDispatch.setOnDidFinishRenderingFrameListener(onDidFinishRenderingFrameListener);
    mapChangeDispatch.onDidFinishRenderingFrame();
    verify(onDidFinishRenderingFrameListener).onDidFinishRenderingFrame();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_RENDERING_FRAME);
  }

  @Test
  public void testOnDidFinishRenderingFrameFullyRenderedListener() throws Exception {
    mapChangeDispatch.setOnDidFinishRenderingFrameFullyRenderedListener(onDidFinishRenderingFrameFullyRenderedListener);
    mapChangeDispatch.onDidFinishRenderingFrameFullyRendered();
    verify(onDidFinishRenderingFrameFullyRenderedListener).onDidFinishRenderingFrameFullyRendered();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_RENDERING_FRAME_FULLY_RENDERED);
  }

  @Test
  public void testOnWillStartRenderingMapListener() throws Exception {
    mapChangeDispatch.setOnWillStartRenderingMapListener(onWillStartRenderingMapListener);
    mapChangeDispatch.onWillStartRenderingMap();
    verify(onWillStartRenderingMapListener).onWillStartRenderingMap();
    verify(onMapChangedListener).onMapChanged(MapView.WILL_START_RENDERING_MAP);
  }

  @Test
  public void testOnDidFinishRenderingMapListener() throws Exception {
    mapChangeDispatch.setOnDidFinishRenderingMapListener(onDidFinishRenderingMapListener);
    mapChangeDispatch.onDidFinishRenderingMap();
    verify(onDidFinishRenderingMapListener).onDidFinishRenderingMap();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_RENDERING_MAP);
  }

  @Test
  public void testOnDidFinishRenderingMapFullyRenderedListener() throws Exception {
    mapChangeDispatch.setOnDidFinishRenderingMapFullyRenderedListener(onDidFinishRenderingMapFullyRenderedListener);
    mapChangeDispatch.onDidFinishRenderingMapFullyRendered();
    verify(onDidFinishRenderingMapFullyRenderedListener).onDidFinishRenderingMapFullyRendered();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_RENDERING_MAP_FULLY_RENDERED);
  }

  @Test
  public void testOnDidFinishLoadingStyleListener() throws Exception {
    mapChangeDispatch.setOnDidFinishLoadingStyleListener(onDidFinishLoadingStyleListener);
    mapChangeDispatch.onDidFinishLoadingStyle();
    verify(onDidFinishLoadingStyleListener).onDidFinishLoadingStyle();
    verify(onMapChangedListener).onMapChanged(MapView.DID_FINISH_LOADING_STYLE);
  }

  @Test
  public void testOnSourceChangedListener() throws Exception {
    mapChangeDispatch.setOnSourceChangedListener(onSourceChangedListener);
    mapChangeDispatch.onSourceChanged();
    verify(onSourceChangedListener).onSourceChangedListener();
    verify(onMapChangedListener).onMapChanged(MapView.SOURCE_DID_CHANGE);
  }
}
