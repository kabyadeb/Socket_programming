# How to Install Cisco Packet Tracer on Ubuntu (Noble 24.xx)

To install **Cisco Packet Tracer**, you first need to **log in** to the official Cisco NetAcad website and download the package from the following link:

[Download Packet Tracer](https://www.netacad.com/courses/getting-started-cisco-packet-tracer?courseLang=en-US)

Once downloaded, follow the steps below to install it.

## Installation Steps

### 1. Install Packet Tracer
Run the following command to install the **Packet Tracer** package:

```bash
sudo dpkg -i Packet_Tracer822_amd64_signed.deb
```
## wait a minute ? faced trouble 

### 2. Install Required Dependencies
For **Ubuntu Noble (24.xx)**, you need to install some additional dependencies.

#### a) Install `dialog`
Download and install the **dialog** package:

```bash
wget http://archive.ubuntu.com/ubuntu/pool/universe/d/dialog/dialog_1.3-20211214-1_amd64.deb
```

Now, install it:

```bash
sudo dpkg -i dialog_1.3-20211214-1_amd64.deb
```

#### b) Install `libxcb-xinerama0`
Download the required **libxcb-xinerama0** package:

```bash
wget http://archive.ubuntu.com/ubuntu/pool/main/libx/libxcb/libxcb-xinerama0_1.14-2_amd64.deb
```

Then, install it:

```bash
sudo dpkg -i libxcb-xinerama0_1.14-2_amd64.deb
```

### 3. Reinstall Packet Tracer
If everything is installed correctly, proceed with Packet Tracer installation again:

```bash
sudo dpkg -i Packet_Tracer822_amd64_signed.deb
```

## Running Packet Tracer
Once installed, you can start **Packet Tracer** by running:

```bash
packettracer
```

## Need Help?
If you still face issues, feel free to reach out:
[LinkedIn Profile](https://www.linkedin.com/in/kabya/)

---
This guide ensures that **Packet Tracer** runs smoothly on **Ubuntu 24.xx** by addressing missing dependencies. Happy networking! 🚀

