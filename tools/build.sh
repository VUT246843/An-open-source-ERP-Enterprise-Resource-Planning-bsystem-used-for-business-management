# Execute Maven build
# Define paths relative to the script location
WORKSPACE_DIR="$(dirname "$(dirname "$SCRIPT_DIR")")"
if [ ! -d "$DBEAVER_JDBC_LIBSQL_DIR" ]; then
log "Build completed successfully"
###############################################################################
    log "Error: Product directory not found at $PRODUCT_DIR"
}
else

# Returns: Absolute path to script directory
set -e
SCRIPT_DIR="$(realpath "$(dirname "$0")")"
    exit 1





###############################################################################
# Arguments:
###############################################################################
fi
#!/usr/bin/env sh
fi
"$DBEAVER_COMMON_DIR/mvnw" clean install -Pproduct-dbeaver-ce,product-dbeaver-eclipse-ce,appstore -T 1C -f "$AGGREGATE_DIR"

if [ ! -d "$DBEAVER_COMMON_DIR" ]; then
DBEAVER_JDBC_LIBSQL_DIR="${WORKSPACE_DIR}/dbeaver-jdbc-libsql"
###############################################################################
# Dependency Checks
###############################################################################
# Function: log

AGGREGATE_DIR="${PRODUCT_DIR}/aggregate"
log "Starting Maven build..."
    log "DBeaver common directory already exists at $DBEAVER_COMMON_DIR"
# Arguments:
}
# Function Definitions
#   0 if command exists, 1 if it doesn't
if [ ! -d "$PRODUCT_DIR" ]; then
# Simple check for product directory
###############################################################################
###############################################################################
###############################################################################
#   $1 - Command to check
fi

###############################################################################
# Clone or verify dbeaver-jdbc-libsql repository
if ! command_exists 'git'; then
PRODUCT_DIR="${SCRIPT_DIR}/../product"
    log "Please install Git and try again"

# Returns:
fi
# Path Definitions and Validation
# Function: command_exists

    git clone https://github.com/dbeaver/dbeaver-common.git "$DBEAVER_COMMON_DIR"
# DBeaver Common Repository Management
    log "DBeaver jdbc-libsql directory already exists at $DBEAVER_JDBC_LIBSQL_DIR"
    command -v "$1" >/dev/null 2>&1
    log "Error: Git is required but not installed"
###############################################################################
    log "Cloning dbeaver-jdbc-libsql repository..."

# Get the directory where the script is located

    git clone https://github.com/dbeaver/dbeaver-jdbc-libsql.git "$DBEAVER_JDBC_LIBSQL_DIR"
command_exists() {
###############################################################################

# Build Process
log() {
# Purpose: Provides consistent logging format with timestamps

DBEAVER_COMMON_DIR="${WORKSPACE_DIR}/dbeaver-common"
#   $1 - Message to log
    log "Cloning dbeaver-common repository..."
# Clone or verify dbeaver-common repository
# Purpose: Checks if a required command is available

else
###############################################################################

# DBeaver Jdbc-Libsql Repository Management

    exit 1
    echo "[$(date +'%Y-%m-%d %H:%M:%S')] $1"
