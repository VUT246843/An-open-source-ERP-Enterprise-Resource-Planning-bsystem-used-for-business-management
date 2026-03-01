import os
import random

# List of non-code file extensions to exclude (you can add more if needed)
NON_CODE_EXTENSIONS = {
    '.jpg', '.jpeg', '.png', '.gif', '.bmp', '.svg', '.webp', '.ico', '.pdf', '.exe', '.zip', '.tar', '.gz', '.rar',
    '.mp3', '.mp4', '.avi', '.mkv', '.mov', '.flv', '.wav', '.mpg', '.ogg', '.doc', '.docx', '.ppt', '.pptx', '.xls', '.xlsx'
}

# Function to check if a file is a code file (based on extension)
def is_code_file(filename):
    code_extensions = {'.py', '.js', '.java', '.properties', '.xml', '.txt', '.cpp', '.md', '.h', '.css', '.html', '.ts', '.go', '.php', '.rb', '.sh', '.mjs', '.rs', '.tsx', '.jsx', '.hpp', '.json', '.yaml', '.yml'}
    ext = os.path.splitext(filename)[1].lower()
    return ext in code_extensions

# Function to shuffle lines in a file
def shuffle_file_lines(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        lines = file.readlines()

    # Shuffle the lines randomly
    random.shuffle(lines)

    # Write the shuffled lines back to the file
    with open(file_path, 'w', encoding='utf-8') as file:
        file.writelines(lines)

# Function to check if a file is larger than 1 MB
def is_file_larger_than_1mb(file_path):
    return os.path.getsize(file_path) > 1 * 1024 * 1024  # 1 MB in bytes

# Function to walk through directories and process files
def process_directory(directory, script_name):
    for root, dirs, files in os.walk(directory):
        for filename in files:
            file_path = os.path.join(root, filename)

            # Skip the script file itself
            if filename == script_name:
                continue

            # Skip non-code files based on the extensions list
            if not is_code_file(filename):
                continue

            # Check if file is larger than 1 MB and remove it if so
            if is_file_larger_than_1mb(file_path):
                try:
                    print(f"Removing large file {file_path} (larger than 1 MB)")
                    os.remove(file_path)
                except Exception as e:
                    print(f"Error removing {file_path}: {e}")
                continue

            try:
                print(f"Shuffling lines in {file_path}")
                shuffle_file_lines(file_path)
            except Exception as e:
                print(f"Error processing {file_path}: {e}")

if __name__ == "__main__":
    # Get the current script's filename to exclude it from processing
    script_name = os.path.basename(__file__)

    # Replace with the path to your repository or working directory
    repo_dir = '.'  # Current directory (use full path if needed)
    
    print(f"Processing directory: {repo_dir}")
    process_directory(repo_dir, script_name)
    print("Done!")