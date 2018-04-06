package com.kisti.osp.constant;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;

public class OSPPropertyKeys {
	public static final String SYSTEM_ROOT_DIR="osp.system.root.dir";
	public static final String PROVENANCE_ROOT_DIR="osp.provenance.root.dir";
	public static final String ICEBUG_ROOT_DIR="osp.icebug.root.dir";
	public static final String ICEBUG_PAPER_ROOT_DIR="osp.icebug.paper.root.dir";
	public static final String ICECAP_ROOT_DIR="osp.icecap.root.dir";
	
	public static final String SPYGLASS_ROOT_DIR="osp.spyglass.root.dir";
	public static final String SPYGLASS_APPS_DIR="osp.spyglass.apps.dir";
	public static final String SPYGLASS_APP_BIN_DIR="osp.spyglass.app.bin.dir";
	public static final String SPYGLASS_APP_DATA_DIR="osp.spyglass.app.data.dir";
	public static final String SPYGLASS_APP_ICON_DIR="osp.spyglass.app.icon.dir";
	public static final String SPYGLASS_APP_SRC_DIR="osp.spyglass.app.src.dir";
	
	public static final String ICEBREAKER_SERVER_IP="osp.icebreaker.server.ip";
	public static final String ICEBREAKER_SERVER_ADDR="osp.icebreaker.server.addr";
	public static final String ICEBREAKER_SERVER_PORT="osp.icebreaker.server.port";
	public static final String ICEBREAKER_SERVER_USER="osp.icebreaker.server.user";
	public static final String ICEBREAKER_SERVER_PASSWORD="osp.icebreaker.server.password";
	
	public static final String SystemRootDir(){
		return GetterUtil.get(PropsUtil.get(SYSTEM_ROOT_DIR), File.separator);
	}
	
	public static final String ProvenanceRootDir(){
		return GetterUtil.get(PropsUtil.get(PROVENANCE_ROOT_DIR), File.separator);
	}
	
	public static final String IcebugRootDir(){
		return GetterUtil.get(PropsUtil.get(ICEBUG_ROOT_DIR), File.separator);
	}
	
	public static final String IcebugPaperRootDir(){
		return GetterUtil.get(PropsUtil.get(ICEBUG_PAPER_ROOT_DIR), File.separator);
	}
	
	public static final String IcecapRootDir(){
		return GetterUtil.get(PropsUtil.get(ICECAP_ROOT_DIR), File.separator);
	}

	public static final String SpyGlassRootDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_ROOT_DIR), File.separator);
	}

	public static final String SpyGlassAppsDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_APPS_DIR), File.separator);
	}

	public static final String SpyGlassAppBinDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_APP_BIN_DIR), File.separator);
	}

	public static final String SpyGlassAppDataDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_APP_DATA_DIR), File.separator);
	}
	
	public static final String SpyGlassAppSrcDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_APP_SRC_DIR), File.separator);
	}
	
	public static final String SpyGlassAppIconDir(){
		return GetterUtil.get(PropsUtil.get(SPYGLASS_APP_ICON_DIR), File.separator);
	}
	
	public static final String IcebreakerServerIP(){
		return GetterUtil.get(PropsUtil.get(ICEBREAKER_SERVER_IP), "");
	}
	
	public static final String IcebreakerServerPort(){
		return GetterUtil.get(PropsUtil.get(ICEBREAKER_SERVER_PORT), "22002");
	}

	public static final String IcebreakerServerAddr(){
		return GetterUtil.get(PropsUtil.get(ICEBREAKER_SERVER_ADDR), "");
	}

	public static final String IcebreakerServerUser(){
		return GetterUtil.get(PropsUtil.get(ICEBREAKER_SERVER_USER), "");
	}

	public static final String IcebreakerServerPassword(){
		return GetterUtil.get(PropsUtil.get(ICEBREAKER_SERVER_PASSWORD), "");
	}

	public static final Path SystemRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SYSTEM_ROOT_DIR), File.separator));
	}
	
	public static final Path ProvenanceRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(PROVENANCE_ROOT_DIR), File.separator));
	}
	
	public static final Path IcebugRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(ICEBUG_ROOT_DIR), File.separator));
	}
	
	public static final Path IcebugPaperRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(ICEBUG_PAPER_ROOT_DIR), File.separator));
	}
	
	public static final Path IcecapRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(ICECAP_ROOT_DIR), File.separator));
	}

	public static final Path SpyGlassRootDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_ROOT_DIR), File.separator));
	}

	public static final Path SpyGlassAppsDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_APPS_DIR), File.separator));
	}

	public static final Path SpyGlassAppBinDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_APP_BIN_DIR), File.separator));
	}

	public static final Path SpyGlassAppDataDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_APP_DATA_DIR), File.separator));
	}
	
	public static final Path SpyGlassAppSrcDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_APP_SRC_DIR), File.separator));
	}
	
	public static final Path SpyGlassAppIconDirPath(){
		return Paths.get(GetterUtil.get(PropsUtil.get(SPYGLASS_APP_ICON_DIR), File.separator));
	}
}
